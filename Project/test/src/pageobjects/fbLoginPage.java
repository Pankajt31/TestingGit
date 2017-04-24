package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title=""                                
     , summary=""
     , relativeUrl=""
     , connection="FaceBook"
     )             
public class fbLoginPage {

	@TextType()
	@FindBy(id = "u_0_1")
	public WebElement Fname;
	@TextType()
	@FindBy(id = "u_0_3")
	public WebElement Lname;
	@TextType()
	@FindBy(id = "u_0_3")
	public WebElement Lname1;
	@TextType()
	@FindBy(id = "u_0_5")
	public WebElement emailid;
	@TextType()
	@FindBy(id = "u_0_8")
	public WebElement re_enteremailID;
	@TextType()
	@FindBy(id = "u_0_8")
	public WebElement re_enteremailID1;
	@FindBy(id = "u_0_a")
	@TextType()
	public WebElement pword;
	@TextType()
	@FindByLabel(label = "Search")
	public WebElement search;
	@ButtonType()
	@FindByLabel(label = "Sign Up")
	public WebElement signUp;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Month"), @ChoiceListValue(value = "1", title = "Jan"), @ChoiceListValue(value = "2", title = "Feb"), @ChoiceListValue(value = "3", title = "Mar"), @ChoiceListValue(value = "4", title = "Apr"), @ChoiceListValue(value = "5", title = "May"), @ChoiceListValue(value = "6", title = "Jun"), @ChoiceListValue(value = "7", title = "Jul"), @ChoiceListValue(value = "8", title = "Aug"), @ChoiceListValue(value = "9", title = "Sep"), @ChoiceListValue(value = "10", title = "Oct"), @ChoiceListValue(value = "11", title = "Nov"), @ChoiceListValue(value = "12", title = "Dec") })
	@FindBy(id = "month")
	public WebElement month;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Day"),
			@ChoiceListValue(value = "1"), @ChoiceListValue(value = "2"),
			@ChoiceListValue(value = "3"), @ChoiceListValue(value = "4"),
			@ChoiceListValue(value = "5"), @ChoiceListValue(value = "6"),
			@ChoiceListValue(value = "7"), @ChoiceListValue(value = "8"),
			@ChoiceListValue(value = "9"), @ChoiceListValue(value = "10"),
			@ChoiceListValue(value = "11"), @ChoiceListValue(value = "12"),
			@ChoiceListValue(value = "13"), @ChoiceListValue(value = "14"),
			@ChoiceListValue(value = "15"), @ChoiceListValue(value = "16"),
			@ChoiceListValue(value = "17"), @ChoiceListValue(value = "18"),
			@ChoiceListValue(value = "19"), @ChoiceListValue(value = "20"),
			@ChoiceListValue(value = "21"), @ChoiceListValue(value = "22"),
			@ChoiceListValue(value = "23"), @ChoiceListValue(value = "24"),
			@ChoiceListValue(value = "25"), @ChoiceListValue(value = "26"),
			@ChoiceListValue(value = "27"), @ChoiceListValue(value = "28"),
			@ChoiceListValue(value = "29"), @ChoiceListValue(value = "30"),
			@ChoiceListValue(value = "31") })
	@FindBy(css = "#day")
	public WebElement Date;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Year"), @ChoiceListValue(value = "2015"), @ChoiceListValue(value = "2014"), @ChoiceListValue(value = "2013"), @ChoiceListValue(value = "2012"), @ChoiceListValue(value = "2011"), @ChoiceListValue(value = "2010"), @ChoiceListValue(value = "2009"), @ChoiceListValue(value = "2008"), @ChoiceListValue(value = "2007"), @ChoiceListValue(value = "2006"), @ChoiceListValue(value = "2005"), @ChoiceListValue(value = "2004"), @ChoiceListValue(value = "2003"), @ChoiceListValue(value = "2002"), @ChoiceListValue(value = "2001"), @ChoiceListValue(value = "2000"), @ChoiceListValue(value = "1999"), @ChoiceListValue(value = "1998"), @ChoiceListValue(value = "1997"), @ChoiceListValue(value = "1996"), @ChoiceListValue(value = "1995"), @ChoiceListValue(value = "1994"), @ChoiceListValue(value = "1993"), @ChoiceListValue(value = "1992"), @ChoiceListValue(value = "1991"), @ChoiceListValue(value = "1990"), @ChoiceListValue(value = "1989"), @ChoiceListValue(value = "1988"), @ChoiceListValue(value = "1987"), @ChoiceListValue(value = "1986"), @ChoiceListValue(value = "1985"), @ChoiceListValue(value = "1984"), @ChoiceListValue(value = "1983"), @ChoiceListValue(value = "1982"), @ChoiceListValue(value = "1981"), @ChoiceListValue(value = "1980"), @ChoiceListValue(value = "1979"), @ChoiceListValue(value = "1978"), @ChoiceListValue(value = "1977"), @ChoiceListValue(value = "1976"), @ChoiceListValue(value = "1975"), @ChoiceListValue(value = "1974"), @ChoiceListValue(value = "1973"), @ChoiceListValue(value = "1972"), @ChoiceListValue(value = "1971"), @ChoiceListValue(value = "1970"), @ChoiceListValue(value = "1969"), @ChoiceListValue(value = "1968"), @ChoiceListValue(value = "1967"), @ChoiceListValue(value = "1966"), @ChoiceListValue(value = "1965"), @ChoiceListValue(value = "1964"), @ChoiceListValue(value = "1963"), @ChoiceListValue(value = "1962"), @ChoiceListValue(value = "1961"), @ChoiceListValue(value = "1960"), @ChoiceListValue(value = "1959"), @ChoiceListValue(value = "1958"), @ChoiceListValue(value = "1957"), @ChoiceListValue(value = "1956"), @ChoiceListValue(value = "1955"), @ChoiceListValue(value = "1954"), @ChoiceListValue(value = "1953"), @ChoiceListValue(value = "1952"), @ChoiceListValue(value = "1951"), @ChoiceListValue(value = "1950"), @ChoiceListValue(value = "1949"), @ChoiceListValue(value = "1948"), @ChoiceListValue(value = "1947"), @ChoiceListValue(value = "1946"), @ChoiceListValue(value = "1945"), @ChoiceListValue(value = "1944"), @ChoiceListValue(value = "1943"), @ChoiceListValue(value = "1942"), @ChoiceListValue(value = "1941"), @ChoiceListValue(value = "1940"), @ChoiceListValue(value = "1939"), @ChoiceListValue(value = "1938"), @ChoiceListValue(value = "1937"), @ChoiceListValue(value = "1936"), @ChoiceListValue(value = "1935"), @ChoiceListValue(value = "1934"), @ChoiceListValue(value = "1933"), @ChoiceListValue(value = "1932"), @ChoiceListValue(value = "1931"), @ChoiceListValue(value = "1930"), @ChoiceListValue(value = "1929"), @ChoiceListValue(value = "1928"), @ChoiceListValue(value = "1927"), @ChoiceListValue(value = "1926"), @ChoiceListValue(value = "1925"), @ChoiceListValue(value = "1924"), @ChoiceListValue(value = "1923"), @ChoiceListValue(value = "1922"), @ChoiceListValue(value = "1921"), @ChoiceListValue(value = "1920"), @ChoiceListValue(value = "1919"), @ChoiceListValue(value = "1918"), @ChoiceListValue(value = "1917"), @ChoiceListValue(value = "1916"), @ChoiceListValue(value = "1915"), @ChoiceListValue(value = "1914"), @ChoiceListValue(value = "1913"), @ChoiceListValue(value = "1912"), @ChoiceListValue(value = "1911"), @ChoiceListValue(value = "1910"), @ChoiceListValue(value = "1909"), @ChoiceListValue(value = "1908"), @ChoiceListValue(value = "1907"), @ChoiceListValue(value = "1906"), @ChoiceListValue(value = "1905") })
	@FindBy(xpath = "//*[@id=\"year\"]")
	public WebElement year;
	@BooleanType()
	@FindByLabel(label = "Male")
	public WebElement male;
			
}
