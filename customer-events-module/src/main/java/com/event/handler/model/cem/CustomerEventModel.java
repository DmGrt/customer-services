package com.event.handler.model.cem;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
@Data
@Builder
@RequiredArgsConstructor
public class CustomerEventModel{
    public String id;
    public ArrayList<String> type;
    public ArrayList<String> bankType;
    public String status;
    public String name;
    public String legalName;
    public String ipoStatus;
    public boolean verified;
    public String icon;
    public String websiteUrl;
    public ArrayList<Object> ownership;
    public boolean stateOwned;
    public Object thirdPartyBankingLicense;
    public String countryHQ;
    public ArrayList<String> countries;
    public ArrayList<Compliance> compliance;
    public Sandbox sandbox;
    public String bic;
    public String developerPortalUrl;
    public String apiReferenceUrl;
    public String apiChangelogUrl;
    public String apiMarketplaceUrl;
    public Object acceleratorProgramUrl;
    public String apiAccess;
    public ArrayList<ApiProduct> apiProducts;
    public ArrayList<String> apiStandards;
    public ArrayList<String> apiAggregators;
    public ArrayList<String> collections;
    public boolean webApplication;
    public ArrayList<MobileApp> mobileApps;
    public String stockSymbol;
    public String investorRelationsUrl;
    public ArrayList<FinancialReport> financialReports;
    public String twitter;
    public String crunchbase;
    public Object github;
    public String fca;
    public String swiftCode;
    public ArrayList<Object> articles;
}

