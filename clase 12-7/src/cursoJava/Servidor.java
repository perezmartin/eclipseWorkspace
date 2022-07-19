package cursoJava;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Servidor {

	public static void main(String[] args) throws IOException {

		final int PORT = 7070;
		final String BIENVENIDA = "Bienvenido/a!";

		try (ServerSocket serverSocket = new ServerSocket(PORT)) {

			System.out.println("Server is listening on port " + PORT);

			while (true) {
				Socket socket = serverSocket.accept();

				System.out.println("New client connected");

				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);

				writer.println(BIENVENIDA);
			}
		}
	}
}