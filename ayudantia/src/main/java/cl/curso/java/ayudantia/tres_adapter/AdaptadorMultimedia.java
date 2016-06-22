/**
 * 
 */
package cl.curso.java.ayudantia.tres_adapter;

/**
 * @author Gabriel Zagal
 *
 */
public class AdaptadorMultimedia implements ReproductorMultimedia {
	private CodecMultimedia codec;
	
	/**
	 * @return the codec
	 */
	public CodecMultimedia getCodec() {
		return codec;
	}

	/**
	 * @param codec the codec to set
	 */
	public void setCodec(CodecMultimedia codec) {
		this.codec = codec;
	}

	public void reproducir() {
		this.getCodec().reproducirMultimedia();
	}

}
