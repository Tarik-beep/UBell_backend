//package com.UniversitySchedule_2_2.services.test;
//
//import com.UniversitySchedule_2_2.dto.test.ObjectDescriptionDTO;
//import com.UniversitySchedule_2_2.entity.test.ObjectDescription;
//import com.UniversitySchedule_2_2.repositories.test.ObjectDescriptionRepository;
//import java.util.List;
//import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ObjectDescriptionService {
//
//    @Autowired
//    private ObjectDescriptionRepository objectDescriptionRepository;
//
//    public List<ObjectDescriptionDTO> getAllObjectDescriptions() {
//        return objectDescriptionRepository.findAll().stream().map(ObjectDescriptionDTO::new).collect(Collectors.toList());
//    }
//
//    public ObjectDescriptionDTO getOneObjectDescription(Long id) {
//        return new ObjectDescriptionDTO(objectDescriptionRepository.getOne(id));
//    }
//
//    public void remove(Long id){
//        objectDescriptionRepository.deleteById(id);
//    }
//
//    public ObjectDescription update(Long id, ObjectDescription objectDescription) {
//        return objectDescriptionRepository.findById(id)
//            .map(employee -> {
//                employee.setId(objectDescription.getId());
//                employee.setName(objectDescription.getName());
//                employee.setNameQr(objectDescription.getNameQr());
//                employee.setDescription(objectDescription.getDescription());
//                return objectDescriptionRepository.save(employee);
//            })
////            .orElseThrow(() -> new ResourceNotFoundException("PostId " + id + " not found"));
//                  .orElseGet(() -> {
//                    objectDescription.setId(id);
//                return objectDescriptionRepository.save(objectDescription);
//            });
//    }
//
//    public ObjectDescription save (ObjectDescription objectDescription) {
//        return objectDescriptionRepository.save(objectDescription);
//    }
//}
