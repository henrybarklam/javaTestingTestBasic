import org.example.ApplicationDao;
import org.example.Mocking;
import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;


import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockingTests{
    Mocking mocking;

    @Mock
    User user;

  @BeforeEach
  public void setup() {
    mocking = new Mocking();
        }
    @Test
    @DisplayName("Permission assigned successfully")
    public void assignPermissions(){
            mocking = new Mocking();
            mocking.setUser(user);

        //When it is called within the function itself
        when(user.getRole()).thenReturn("admin");
        when(user.getUsername()).thenReturn("admin");

    //This is the actual function call that then runs the above code
    Assertions.assertEquals(1, mocking.assignPermission());
    }

    @Mock
    ApplicationDao applicationDao;

    @Test
    @DisplayName("User updated successfully")

    public void updateUsername() throws Exception {
        User user = new User();
        user.setUsername("Henry");
        when(applicationDao.getByUserId(Mockito.anyString())).thenReturn(user);
        Assertions.assertEquals(1, mocking.updateUsername("3211", "allan"));

    }
}



