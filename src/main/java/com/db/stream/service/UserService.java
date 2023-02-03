package com.db.stream.service;

import com.db.stream.entity.Company;
import com.db.stream.entity.Manager;
import com.db.stream.entity.User;
import com.db.stream.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.db.stream.utils.RequestResponse.result;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * Player(User) login
     *
     * @param user u_email u_pwd
     * @return {code, message}
     */
    public Map<String, Object> loginUserAccount(User user) {
        List<User> userList = userMapper.selectUserByEmail(user.getU_email());

        if (userList == null || userList.size() != 1) {
            return result(400, "User does not exist");
        }
        User user1 = userList.get(0);
        if (user1.getU_pwd().equals(user.getU_pwd())) {
            if (user1.getU_permission().equals(0)) {
                return result(400, "Access denied");
            } else {
                return result(200, "Success");
            }
        } else {
            return result(400, "Wrong email/password");
        }
    }

    /**
     * Player(User) sign up
     *
     * @param user u_name u_email u_pwd
     * @return {code, message}
     */
    public Map<String, Object> createUserAccount(User user) {
        List<User> userList = userMapper.selectUserByEmail(user.getU_email());
        if (!userList.isEmpty()) {
            return result(400, "User have already existed");
        } else {
            Integer addUser = userMapper.createUserAccount(user);
            if (addUser > 0) {
                return result(200, "Success");
            } else {
                return result(400, "Create failed");
            }
        }
    }


    /**
     * Company login
     *
     * @param company com_email com_pwd
     * @return {code, message}
     */
    public Map<String, Object> loginComAccount(Company company) {
        Map<String, Object> resultMap = new HashMap<>();
        List<Company> companyList = userMapper.selectComByEmail(company.getCom_email());
        if (companyList == null || companyList.size() != 1) {
            return result(400, "User does not exist");
        }
        Company company1 = companyList.get(0);
        if (company1.getCom_pwd().equals(company.getCom_pwd())) {
            if (company1.getCom_permission().equals(0)) {
                return result(400, "Access denied");
            } else {
                return result(200, "Success");
            }
        } else {
            return result(400, "Wrong email/password");
        }
    }

    /**
     * Company Sign up
     *
     * @param company Company com_name com_email com_pwd
     * @return {code, message}
     */
    public Map<String, Object> createComAccount(Company company) {
        List<Company> companyList = userMapper.selectComByEmail(company.getCom_email());
        if (!companyList.isEmpty()) {
            return result(400, "User have already existed");
        } else {
            Integer addCom = userMapper.createComAccount(company);
            if (addCom > 0) {
                return result(200, "Success");
            } else {
                return result(400, "Create failed");
            }
        }
    }

    /**
     * Manager login
     *
     * @param manager com_email com_pwd
     * @return {code, message}
     */
    public Map<String, Object> loginManagerAccount(Manager manager) {
        List<Manager> managerList = userMapper.selectManagerByEmail(manager.getM_email());
        if (managerList == null || managerList.size() != 1) {
            return result(400, "User does not exist");
        }
        Manager manager1 = managerList.get(0);
        if (manager1.getM_pwd().equals(manager.getM_pwd())) {
            return result(300, "Success");
        } else {
            return result(400, "Wrong email/password");
        }
    }

    /**
     * @param manager name email pwd
     * @return {code, message}
     */
    public Map<String, Object> createManagerAccount(Manager manager) {
        List<Manager> managerList = userMapper.selectManagerByEmail(manager.getM_email());
        if (!managerList.isEmpty()) {
            return result(400, "User have already existed");
        } else {
            Integer addManager = userMapper.createManagerAccount(manager);
            if (addManager > 0) {
                return result(200, "Success");
            } else {
                return result(400, "Create failed");
            }
        }
    }

}
