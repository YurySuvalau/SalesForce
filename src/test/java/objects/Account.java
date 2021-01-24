package objects;

public class Account {
    String accountName;
    String webSite;
    String type;
    String phone;
    String fax;
    String industry;
    String employees;
    String annual_revenue;
    String description;
    String billing_street;
    String billing_city;
    String billing_state_province;
    String billing_zip_postal_code;
    String billing_country;

    public Account(String accountName, String webSite,
                   String type, String phone, String fax,
                   String industry, String employees, String annual_revenue,
                   String description, String billing_street, String billing_city,
                   String billing_state_province, String billing_zip_postal_code,
                   String billing_country) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
        this.phone = phone;
        this.fax = fax;
        this.industry = industry;
        this.employees = employees;
        this.annual_revenue = annual_revenue;
        this.description = description;
        this.billing_street = billing_street;
        this.billing_city = billing_city;
        this.billing_state_province = billing_state_province;
        this.billing_zip_postal_code = billing_zip_postal_code;
        this.billing_country = billing_country;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnual_revenue() {
        return annual_revenue;
    }

    public void setAnnual_revenue(String annual_revenue) {
        this.annual_revenue = annual_revenue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBilling_street() {
        return billing_street;
    }

    public void setBilling_street(String billing_street) {
        this.billing_street = billing_street;
    }

    public String getBilling_city() {
        return billing_city;
    }

    public void setBilling_city(String billing_city) {
        this.billing_city = billing_city;
    }

    public String getBilling_state_province() {
        return billing_state_province;
    }

    public void setBilling_state_province(String billing_state_province) {
        this.billing_state_province = billing_state_province;
    }

    public String getBilling_zip_postal_code() {
        return billing_zip_postal_code;
    }

    public void setBilling_zip_postal_code(String billing_zip_postal_code) {
        this.billing_zip_postal_code = billing_zip_postal_code;
    }

    public String getBilling_country() {
        return billing_country;
    }

    public void setBilling_country(String billing_country) {
        this.billing_country = billing_country;
    }
}

