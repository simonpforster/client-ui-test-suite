/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object HomePage extends BasePage {
    val url: String = "http://localhost:9008/example-frontend"
    val title: String = "Home"

    def registerButton: WebElement = driver.findElement(By.id("register"))
    def loginButton: WebElement = driver.findElement(By.id("login"))

  def startRegister(): Unit = {
    registerButton.click()
  }
  def startLogin(): Unit = {
    loginButton.click()
  }

}
