/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object SummaryPage extends BasePage {
  val title: String = "Summary"

  val nameValue: WebElement = driver.findElement(By.id(""))
  val businessNameValue: WebElement = driver.findElement(By.id(""))
  val contactNumberValue: WebElement = driver.findElement(By.id(""))
  val propertyValue: WebElement = driver.findElement(By.id(""))
  val businessTypeValue: WebElement = driver.findElement(By.id(""))

  def checkName: Boolean = {
     nameValue.getText == testName
  }
  def checkBusinessName: Boolean = {
    businessNameValue.getText == testBusinessName
  }
  def checkContactNumber: Boolean = {
    contactNumberValue.getText == testNumber
  }
  def checkProperty: Boolean = {
    propertyValue.getText.contains(testPropertyNo) && propertyValue.getText.contains(testPostcode)
  }
  def checkBusinessType: Boolean = {
    businessTypeValue.getText == businessType
  }
}
