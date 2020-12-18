package  com.navettevatry.rem4u.common.resources.dto.TaxiMetre;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

public class Result implements Serializable {
    private String company;
    private String category;
    private String companycategory;
    private double price;
    private String time;
    private String url;
    private PostParams postParams;
    private Object promotion;

    @JsonProperty("company")
    public String getCompany() { return company; }
    @JsonProperty("company")
    public void setCompany(String value) { this.company = value; }

    @JsonProperty("category")
    public String getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(String value) { this.category = value; }

    @JsonProperty("companycategory")
    public String getCompanycategory() { return companycategory; }
    @JsonProperty("companycategory")
    public void setCompanycategory(String value) { this.companycategory = value; }

    @JsonProperty("price")
    public double getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(double value) { this.price = value; }

    @JsonProperty("time")
    public String getTime() { return time; }
    @JsonProperty("time")
    public void setTime(String value) { this.time = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("postParams")
    public PostParams getPostParams() { return postParams; }
    @JsonProperty("postParams")
    public void setPostParams(PostParams value) { this.postParams = value; }

    @JsonProperty("promotion")
    public Object getPromotion() { return promotion; }
    @JsonProperty("promotion")
    public void setPromotion(Object value) { this.promotion = value; }
}
