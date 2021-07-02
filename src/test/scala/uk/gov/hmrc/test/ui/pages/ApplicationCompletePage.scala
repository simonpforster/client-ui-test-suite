/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object ApplicationCompletePage extends BasePage {
  val title: String = "Application Complete"

  val crnReturn: WebElement = driver.findElement(By.id("crn"))

  def getCRN: String = {
    crnReturn.getText
  }
}
