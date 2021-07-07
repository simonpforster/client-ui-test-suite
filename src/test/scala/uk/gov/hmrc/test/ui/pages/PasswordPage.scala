/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object PasswordPage extends BasePage {
  val title: String = "Enter Password"

  def passwordInput: WebElement = driver.findElement(By.id("password"))

  def passwordCheckInput: WebElement = driver.findElement(By.id("passwordCheck"))

  def enterPassword(): Unit = {
    passwordInput.sendKeys(testPassword)
    passwordCheckInput.sendKeys(testPassword)
  }
}
