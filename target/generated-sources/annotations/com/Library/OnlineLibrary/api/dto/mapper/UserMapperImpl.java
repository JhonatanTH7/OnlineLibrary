package com.Library.OnlineLibrary.api.dto.mapper;

import com.Library.OnlineLibrary.api.dto.GetUser;
import com.Library.OnlineLibrary.domain.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T08:50:43-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public GetUser userToGetDTO(User user) {
        if ( user == null ) {
            return null;
        }

        GetUser getUser = new GetUser();

        getUser.setId( user.getId() );
        getUser.setUserName( user.getUserName() );
        getUser.setPassword( user.getPassword() );
        getUser.setEmail( user.getEmail() );
        getUser.setFullName( user.getFullName() );
        getUser.setRole( user.getRole() );

        return getUser;
    }
}
