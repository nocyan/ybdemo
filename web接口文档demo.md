# web接口文档demo

## 学生

### GET /sum

- 功能：得到学生成绩的总和

- request

  | 参数   | 数据类型 | 描述   |
  | ---- | ---- | ---- |
  | 无    | 无    | 无    |

  （实际开发时，没有参数可以不写表格）

  示例

  ```
  /sum
  ```

- response

  | 参数        | 数据类型    | 描述                                       |
  | --------- | ------- | ---------------------------------------- |
  | code      | int     | 错误码，为0则没有错误                              |
  | status    | boolean | 操作状态，即是否成功                               |
  | operation | string  | 操作内容                                     |
  | data      | object  | 返回对象，对象中的字段在下面进行描述（实际开发中不进行code、status和operation的解释，只解释data对象中的字段） |
  | sum       | int     | 学生成绩总和                                   |

  示例

  ```
  {"code":0,"data":{"sum":315},"operation":"get students scores sum","status":true}
  ```

  ​