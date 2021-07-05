/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object DashboardPage extends BasePage {
  override val title: String = "Dashboard"

  def deleteUserButton(): WebElement = driver.findElement(By.id("delete-user"))

  def logoutButton: WebElement = driver.findElement(By.id("logout"))

  def logout(): Unit = {
    logoutButton.click()
  }

  def delete(): Unit = {
    deleteUserButton().click()
  }


}
