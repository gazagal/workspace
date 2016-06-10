/**
 * 
 */
package cl.curso.java.guia9.uno;

/**
 * @author Gabriel Zagal
 *
 */
public class Libro {
	private String nombre;
	private String autor;
	private String editorial;
	private String isbn;
	
	public Libro(){
		
	}

	/**
	 * @param nombre
	 * @param autor
	 * @param editorial
	 * @param isbn
	 */
	public Libro(String nombre, String autor, String editorial, String isbn) {
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * @return validacion ISBN
	 */
	public boolean validarIsbn(){
		if ( isbn == null )
        {
            return false;
        }

        //remueve los separadores (si los tiene) y los remplaza con vacio 
        isbn = isbn.replaceAll( "-", "" );

        //verifica que tenga 10 digitos
        if ( isbn.length() != 10 )
        {
            return false;
        }

        try
        {
            int tot = 0;
            for ( int i = 0; i < 9; i++ )
            {
                int digit = Integer.parseInt( isbn.substring( i, i + 1 ) );
                tot += ((10 - i) * digit);
            }

            String checksum = Integer.toString( (11 - (tot % 11)) % 11 );
            if ( "10".equals( checksum ) )
            {
                checksum = "X";
            }

            return checksum.equals( isbn.substring( 9 ) );
        }
        catch ( NumberFormatException nfe )
        {
        	//para detectar ISBNs invalidos porque tienen caracteres no numericos en ellos
            return false;
        }
	}
	
	
	
	
}
