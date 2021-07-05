/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object ContactNumberPage extends BasePage {
  val title: String = "Enter Contact Number"

  def numberInput: WebElement = driver.findElement(By.id("contact-number"))

  def enterNumber():Unit = {
    numberInput.sendKeys(testNumber)
    submit()
  }
}
