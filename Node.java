/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola k�dov�n�: P��li� �lu�ou�k� k�� �p�l ��belsk� �dy. */

/*******************************************************************************
 * Instance t��dy {@code Node} p�edstavuj� vrcholy grafu.
 *
 * @author    jmacura
 * @version   2.01.000
 */
public class Node
{
    /**
     * Jm�no vrcholu.
     */
    private String id;
    /**
     * Seznam hran.
     */
    public Edge edges;

    /**
     * Konstruktor objekt� t��dy {@code Node}.
     * 
     * @param id Jm�no nov�ho vrcholu
     */
    public Node(String id)
    {
        setId(id);
        edges = null;
    }
    
    /**
     * Nastavuje parametr id.
     */
    public void setId(String newId)
    {
        this.id = newId;
    }
    
    /**
     * Vrac� parametr id.
     * 
     * @return {@code String} ID vrcholu
     */
    public String getId()
    {
        return this.id;
    }

}
