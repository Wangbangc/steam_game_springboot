package com.example.demo.spark

object DataCleaningJob {
  // 导入必要的库
  import org.apache.spark.sql.{SparkSession, DataFrame}
  import org.apache.spark.sql.functions._

  def main(args: Array[String]): Unit = {
    // 创建SparkSession
    val spark = SparkSession.builder()
      .appName("Data Cleaning Job")
      .config("spark.master", "local")
      .getOrCreate()

    // 读取MySQL数据
    val jdbcUrl = "jdbc:mysql://localhost:3306/steam_game"
    val connectionProperties = new java.util.Properties()
    connectionProperties.put("driver", "com.mysql.cj.jdbc.Driver")
    connectionProperties.put("user", "root")
    connectionProperties.put("password", "123456")

    try {
      val gamesDF: DataFrame = spark.read
        .jdbc(jdbcUrl, "games", connectionProperties)

      // 显示原始数据
      println("原始数据:")
      gamesDF.show()

      // 数据清洗：假设乱码是由于字符编码问题导致的，可以尝试转换编码
      val cleanedDF: DataFrame = gamesDF
        .withColumn("name", expr("CAST(name AS STRING)"))
        .withColumn("developer", expr("CAST(developer AS STRING)"))
        .withColumn("publisher", expr("CAST(publisher AS STRING)"))
        .withColumn("platforms", expr("CAST(platforms AS STRING)"))
        .withColumn("categories", expr("CAST(categories AS STRING)"))
        .withColumn("owners", expr("CAST(owners AS STRING)"))

      // 显示清洗后的数据
      println("清洗后的数据:")
      cleanedDF.show()

      // 将清洗后的数据写回MySQL
      cleanedDF.write
        .mode("overwrite")
        .jdbc(jdbcUrl, "cleaned_games", connectionProperties)

      // 停止SparkSession
      spark.stop()
    } catch {
      case e: Exception => {
        println("Error during data cleaning job: " + e.getMessage) // 修改: 使用 + 操作符拼接字符串
        e.printStackTrace()
        spark.stop()
      }
    }
  }
}
