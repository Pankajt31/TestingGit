package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="06620000001fYaB"
               , namespacePrefix=""
               , object=""
               , connection="Bank_RetailDepartment"
     )             
public class zz {

	@PageFrame()
	public static class Frame {
	}

	@FindBy(xpath = "//*[@id=\"j_id1\"]")
	public Frame frame;
	
}
