/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.acme.order.model;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class TransactionSetHeader implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private String transactionSetIdentifier;
    private String transactionSetControlNumber;

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(transactionSetIdentifier != null) {
            nodeWriter.write(delimiters.escape(transactionSetIdentifier.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(transactionSetControlNumber != null) {
            nodeWriter.write(delimiters.escape(transactionSetControlNumber.toString()));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public String getTransactionSetIdentifier() {
        return transactionSetIdentifier;
    }

    public TransactionSetHeader setTransactionSetIdentifier(String transactionSetIdentifier) {
        this.transactionSetIdentifier = transactionSetIdentifier;  return this;
    }

    public String getTransactionSetControlNumber() {
        return transactionSetControlNumber;
    }

    public TransactionSetHeader setTransactionSetControlNumber(String transactionSetControlNumber) {
        this.transactionSetControlNumber = transactionSetControlNumber;  return this;
    }
}