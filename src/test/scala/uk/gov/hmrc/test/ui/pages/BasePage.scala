/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.BrowserDriver

trait BasePage extends Matchers with BrowserDriver {
  val url: String = "http://localhost:9008/example-frontend"
  val title: String

  def submitButton: WebElement = driver.findElement(By.id("submit"))

  val testName: String = "testName"
  val testBusinessName: String = "testName"
  val testNumber: String = "testNumber"
  val testPropertyNo: String = "5"
  val testPostcode: String = "testPostcode"
  val businessType: String = "Sole Trader"
  val testPassword: String = "testPass"


  def goHere(): Unit = {
    driver.navigate().to(url)
  }

  def getTitle: String = {
    val title: String = driver.getTitle
    title
  }

  def checkTitle(): Boolean = {
    getTitle == title
  }

  def submit(): Unit = {
    submitButton.click()
  }
}
