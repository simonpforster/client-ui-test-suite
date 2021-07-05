/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object BusinessNamePage extends BasePage {
  val title: String = "Enter Business Name"

  def nameInput: WebElement = driver.findElement(By.id("business-name"))

  def enterName():Unit = {
    nameInput.sendKeys(testName)
    submit()
  }
}
