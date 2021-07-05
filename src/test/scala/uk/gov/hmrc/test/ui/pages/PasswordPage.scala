/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object PasswordPage extends BasePage {
  val title: String = "Enter Password"

  def passwordInput: WebElement = driver.findElement(By.id("password"))

  def enterPassword(): Unit = {
    passwordInput.sendKeys(testPassword)
    submit()
  }
}
