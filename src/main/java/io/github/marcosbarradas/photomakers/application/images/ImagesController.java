package io.github.marcosbarradas.photomakers.application.images;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/v1/images")
@Slf4j
public class ImagesController {
    //esse projeto não utiliza json, pois json não trafega bytes, esse projeto utiliza mult-part/formdata
    @PostMapping
    public ResponseEntity save(
            @RequestParam("file") MultipartFile file, // arquivo em bytes
            @RequestParam("name") String name, // nome escolhido pelo user
            @RequestParam("tags") List<String> tags //lista de campos repetidos
    ){
        log.info("imagem recebida: name {}, size {}", file.getOriginalFilename(), file.getSize());
        log.info("nome imagem: name {}", name);
        log.info("Tags: {}", tags);

        return ResponseEntity.ok().build();
    }
}
