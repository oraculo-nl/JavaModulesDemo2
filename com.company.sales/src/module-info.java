module com.company.sales {
    exports commercial;
    exports commercial.internal to com.company.hr, com.company.development;
    provides commercial.Regional with commercial.Customer;
    opens commercial to com.company.development;
}