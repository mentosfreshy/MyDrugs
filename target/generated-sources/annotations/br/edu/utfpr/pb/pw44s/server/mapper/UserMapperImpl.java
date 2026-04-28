package br.edu.utfpr.pb.pw44s.server.mapper;

import br.edu.utfpr.pb.pw44s.server.dto.UserDTO;
import br.edu.utfpr.pb.pw44s.server.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-27T20:18:33-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.username( dto.getUsername() );
        user.displayName( dto.getDisplayName() );
        user.password( dto.getPassword() );

        return user.build();
    }

    @Override
    public UserDTO toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.username( user.getUsername() );
        userDTO.displayName( user.getDisplayName() );
        userDTO.password( user.getPassword() );

        return userDTO.build();
    }
}
