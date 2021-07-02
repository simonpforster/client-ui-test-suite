/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object LoginPage extends BasePage {
  val url: String = "http://localhost:9008/example-frontend/login"
  val title: String = "Login"
  val testPassword: String = "testPass"
  var testCRN: String = "testCRN"

  def crnField: WebElement = driver.findElement(By.id("crn"))
  def passwordField: WebElement = driver.findElement(By.id("password"))
  def submitButton: WebElement = driver.findElement(By.id("submit"))

  def login(): Unit = {
    enterCRN()
    enterPassword()
    submit()
  }

  def enterCRN(): Unit = {
    crnField.sendKeys(testCRN)
  }
  def enterPassword(): Unit = {
    passwordField.sendKeys(testPassword)
  }
  def submit(): Unit = {
    submitButton.click()
  }
}
