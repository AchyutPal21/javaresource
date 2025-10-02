package com.prepjava.lld.solid;

// Open/Close Principle says open for extension but close for modification.

class InvoiceDaoOCP {
  private InvoiceSRP invoiceSRP;
  public InvoiceDaoOCP (InvoiceSRP invoiceSRP) {
    this.invoiceSRP = invoiceSRP;
  }

  public void saveToSQL() {
    float cost = invoiceSRP.calculatePrice();
    System.out.println("Store to sql-db" + cost);
    return;
  }

  // This is X wrong approach, this approach is
  // prone to more bugs or code break down
  public void saveToNoSql() {
    float cost = invoiceSRP.calculatePrice();
    System.out.println("Store to nosql-db" + cost);
    return;
  }
}



public class OCP {
  /*
   * Suppose we have the class InvoiceDao {}, suppose this class
   * is well tested and is live and receiving traffic, and we
   * get an update that we need to store some information is
   * no-sql data base also.
   * -------------------------------------------------------
   * 
   * We introduce interface and implemented them in the class.
   * Doing in this way, extend any class as per requirements in 
   * future for storing requirement without modifying existing 
   * class.
   * 
   */
}

interface InvoiceDaoI {
  public void save(Invoice invoice);
}

class InvoiceDaoSQL implements InvoiceDaoI {
  private InvoiceSRP invoiceSRP;
  public InvoiceDaoSQL (InvoiceSRP invoiceSRP) {
    this.invoiceSRP = invoiceSRP;
  }

  @Override
  public void save(Invoice invoice) {
    float cost = invoiceSRP.calculatePrice();
    System.out.println("Store to sql-db" + cost);
    return;
  }
}

class InvoiceDaoNoSQL implements InvoiceDaoI {
  private InvoiceSRP invoiceSRP;
  public InvoiceDaoNoSQL (InvoiceSRP invoiceSRP) {
    this.invoiceSRP = invoiceSRP;
  }

  @Override
  public void save(Invoice invoice) {
    float cost = invoiceSRP.calculatePrice();
    System.out.println("Store to sql-db" + cost);
    return;
  }
}



