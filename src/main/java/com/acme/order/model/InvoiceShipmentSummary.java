/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.acme.order.model;

import java.io.Serializable;    
import org.milyn.smooks.edi.EDIWritable;    
import java.math.BigDecimal;    
import org.milyn.javabean.decoders.BigDecimalDecoder;    
import java.io.Writer;    
import org.milyn.edisax.model.internal.Delimiters;    
import java.io.IOException;    

public class InvoiceShipmentSummary implements Serializable, EDIWritable {

    private static final long serialVersionUID = 1L;

    private BigDecimal numberOfUnitsShipped;
    private BigDecimalDecoder numberOfUnitsShippedEncoder;
    private String numberUom;
    private BigDecimal weight;
    private BigDecimalDecoder weightEncoder;
    private String weightUom;

    public InvoiceShipmentSummary() {
        
        numberOfUnitsShippedEncoder = new BigDecimalDecoder();
        weightEncoder = new BigDecimalDecoder();
    }

    public void write(Writer writer, Delimiters delimiters) throws IOException {
        
        Writer nodeWriter = writer;

        if(numberOfUnitsShipped != null) {
            nodeWriter.write(delimiters.escape(numberOfUnitsShippedEncoder.encode(numberOfUnitsShipped)));
        }
        nodeWriter.write(delimiters.getField());
        if(numberUom != null) {
            nodeWriter.write(delimiters.escape(numberUom.toString()));
        }
        nodeWriter.write(delimiters.getField());
        if(weight != null) {
            nodeWriter.write(delimiters.escape(weightEncoder.encode(weight)));
        }
        nodeWriter.write(delimiters.getField());
        if(weightUom != null) {
            nodeWriter.write(delimiters.escape(weightUom.toString()));
        }
        writer.write(delimiters.getSegmentDelimiter());
        writer.flush();
    }

    public BigDecimal getNumberOfUnitsShipped() {
        return numberOfUnitsShipped;
    }

    public InvoiceShipmentSummary setNumberOfUnitsShipped(BigDecimal numberOfUnitsShipped) {
        this.numberOfUnitsShipped = numberOfUnitsShipped;  return this;
    }

    public String getNumberUom() {
        return numberUom;
    }

    public InvoiceShipmentSummary setNumberUom(String numberUom) {
        this.numberUom = numberUom;  return this;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public InvoiceShipmentSummary setWeight(BigDecimal weight) {
        this.weight = weight;  return this;
    }

    public String getWeightUom() {
        return weightUom;
    }

    public InvoiceShipmentSummary setWeightUom(String weightUom) {
        this.weightUom = weightUom;  return this;
    }
}