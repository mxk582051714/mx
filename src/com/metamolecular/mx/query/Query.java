/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.metamolecular.mx.query;

/**
 * @author Richard L. Apodaca <rapodaca at metamolecular.com>
 */
public interface Query
{
  public Node addNode(DefaultAtomMatcher matcher);
  
  public int countNodes();
  
  public void connect(Node source, Node target);
}
