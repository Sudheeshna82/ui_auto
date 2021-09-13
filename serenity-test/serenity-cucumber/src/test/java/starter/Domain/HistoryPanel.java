package starter.Domain;

import org.openqa.selenium.By;

public class HistoryPanel {
    public static final By HISTORY_ROWS = By.xpath("//table/tbody/tr");
    public static final By EXPRESSION = By.xpath("td[2]");
    public static final By RESULT = By.xpath("td[3]");
    public static final By CAR_ROWS = By.xpath("//*[@id=\"m\"]/div[2]/div[5]/div[1]/div/span/div[2]/dl[1]");
    public static final By REGISTRATION_NO = By.xpath("//*[@id=\"m\"]/div[2]/div[5]/div[1]/div/span/div[2]/dl[1]/dd");
    public static final By MAKE = By.xpath("//*[@id=\"m\"]/div[2]/div[5]/div[1]/div/span/div[2]/dl[2]/dd");
    public static final By MODEL = By.xpath("//*[@id=\"m\"]/div[2]/div[5]/div[1]/div/span/div[2]/dl[3]/dd");
    public static final By COLOR = By.xpath("//*[@id=\"m\"]/div[2]/div[5]/div[1]/div/span/div[2]/dl[4]/dd");
    public static final By YEAR = By.xpath("//*[@id=\"m\"]/div[2]/div[5]/div[1]/div/span/div[2]/dl[5]/dd");
}

