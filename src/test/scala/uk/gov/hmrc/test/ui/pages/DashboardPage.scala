/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object DashboardPage extends BasePage {
  val title: String = "Dashboard"
  val errorMessage: String = "error placed here"
  val incorrectARN: String = "foobar"

  def arnInput: WebElement = driver.findElement(By.id("arn"))

  def arnRemoveButton: WebElement = driver.findElement(By.id("remove"))

  def arnLabel: WebElement = driver.findElement(By.id("arn-label"))

  def arnErrorLabel: WebElement = driver.findElement(By.id("arn-error"))

  def deleteUserButton(): WebElement = driver.findElement(By.id("delete-user"))

  def logoutButton: WebElement = driver.findElement(By.id("logout"))

  def logout(): Unit = {
    logoutButton.click()
  }

  def delete(): Unit = {
    deleteUserButton().click()
  }

  def removeArn(): Unit = {
    arnRemoveButton.click()
  }

  def enterIncorrectARN(): Unit = {
    arnInput.sendKeys(incorrectARN)
  }

  def enterARN(): Unit = {
    arnInput.sendKeys(testARN)
  }

  def checkAddButtonExists: Boolean = {
    submitButton.isDisplayed
  }

  def checkArnExists(): Boolean = {
    arnLabel.getText.contains(testARN)
  }

  def checkError(): Boolean = {
    arnErrorLabel.getText.contains("Enter the ARN")
  }
}
