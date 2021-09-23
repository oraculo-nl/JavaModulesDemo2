
module com.company.hr {
    exports department;
    requires transitive com.company.sales;
    uses commercial.Regional;
}