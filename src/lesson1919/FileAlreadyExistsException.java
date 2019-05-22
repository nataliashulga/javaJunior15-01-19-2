package lesson1919;

/**
 * Если целевой файл уже существует. будет выброшено данное исключение
 * 
 * @author nedis
 * @version 1.0
 */
public class FileAlreadyExistsException extends FileCopyFailedException {
	private static final long serialVersionUID = -561889344684004145L;

	public FileAlreadyExistsException(String message) {
		super(message);
	}

}
