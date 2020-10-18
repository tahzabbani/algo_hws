/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class HashEntry {
      private double key;
      private String value;

      HashEntry(double key, String value) {
            this.key = key;
            this.value = value;
      }     

      public double getKey() {
            return key;
      }

      public String  getValue() {
            return value;
      }
      
      public void setValue(String val) {
            this.value = val;
      }
}
