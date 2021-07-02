/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object NameEntryPage extends BasePage {
  val title: String = "Enter Name"

  def nameInput: WebElement = driver.findElement(By.id("name"))

  def enterName():Unit = {
    nameInput.sendKeys(testName)
    submit()
  }
}
