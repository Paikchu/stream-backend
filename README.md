# Stream 
#### Video Game Distributor Platform

## User Sign in/up

| URL           | Param                          | Return          | Description     | Format |
| ------------- | ------------------------------ | --------------- | --------------- | ------ |
| /user-sign-in | {u_email, u_pwd}               | {code, message} | Player sign in  | Json   |
| /user-sign-up | {u_name, u_email, u_pwd}       | {code, message} | Player sign up  | Json   |
| /com-sign-in  | {com_email, com_pwd}           | {code, message} | Company sign in | Json   |
| /com-sign-up  | {com_name, com_email, com_pwd} | {code, message} | Company sign up | Json   |
| /man-sign-in  | {m_email, m_pwd}               | {code, message} | Manager sign in | Json   |
| /man-sign-up  | {m_name, m_email, m_pwd}       | {code, message} | Manager sign up | Json   |



## utils

### RequestResponse
#### public static Map<String, Object> result(Integer code, Object mess)
Generate returned json data
```json
{
	"code" : "#{code}",
	"message": "#{message}"
}
```