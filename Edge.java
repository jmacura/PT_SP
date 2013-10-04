/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola k�dov�n�: P��li� �lu�ou�k� k�� �p�l ��belsk� �dy. */

/*******************************************************************************
 * Instance t��dy {@code Edge} p�edstavuj� hrany grafu.
 *
 * @author    jmacura
 * @version   1.01.000
 */
public class Edge
{
    /**
     * Po�ad� vrcholu, na n�j� hrana ukazuje, v poli vrchol�
     * {@code nodes[]} t��dy {@code Graph}.
     */
    public int node;
    /**
     * Dal�� hrana v seznamu.
     */
    public Edge nxt;
    
    /**
     * Konstruktor objekt� t��dy Edge
     * 
     * @param v Index vrcholu, na kter� hrana vede, v poli
     * vrchol� t��dy {@code Graph}
     */
    public Edge(int v)
    {
        node = v;
        nxt = null;
    }
}