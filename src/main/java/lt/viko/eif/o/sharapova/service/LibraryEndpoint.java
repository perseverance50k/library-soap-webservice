package lt.viko.eif.o.sharapova.service;

import lt.viko.eif.o.sharapova.client.GetLibrariesByBookRequest;
import lt.viko.eif.o.sharapova.client.GetLibrariesByBookResponse;
import lt.viko.eif.o.sharapova.client.GetLibraryByNameRequest;
import lt.viko.eif.o.sharapova.client.GetLibraryByNameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LibraryEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private LibraryRepository libraryRepository;

    @Autowired
    public LibraryEndpoint(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLibraryByNameRequest")
    @ResponsePayload
    public GetLibraryByNameResponse getLibraryByName(@RequestPayload GetLibraryByNameRequest request) {
        GetLibraryByNameResponse response = new GetLibraryByNameResponse();
        response.setLibrary(libraryRepository.findLibraryByName(request.getName()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLibrariesByBookRequest")
    @ResponsePayload
    public GetLibrariesByBookResponse getLibrariesByBook(@RequestPayload GetLibrariesByBookRequest request) {
        GetLibrariesByBookResponse response = new GetLibrariesByBookResponse();
        response.getLibraries().addAll(libraryRepository.findLibrariesByBook(request.getBook()));

        return response;
    }
}
