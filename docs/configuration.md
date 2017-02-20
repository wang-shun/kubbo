# kubbo.properties

## 服务端配置
```
server.bind = kubbo://0.0.0.0:40660?corethreads=30&maxthreads=100&queues=200
```
corethreads: 处理线程池初始大小  
maxthreads: 处理线程池最大数量  
queues: 请求处理队列  
当处理线程数大于corethreads, 超过1分钟的空闲线程会自动释放  
当处理线程数达到maxthreads, 新的请求将被插入处理队列等待处理。  

## 客户端配置 
```
reference.com.sogou.map.kubbo.SampleService = kubbo://127.0.0.1:40660?timeout=2000
```

当程序中需要调用同一个接口的不同实现时, 可以使用双行配置方式。  
双行配置时可以按名称来区分不同的接口实现如: Kubbo.refer("name1", SampleService.class)
```
reference.name1.interface = com.sogou.map.kubbo.SampleService
reference.name1.address = kubbo://10.134.77.209:40660?timeout=2000
reference.name2.interface = com.sogou.map.kubbo.SampleService
reference.name2.address = kubbo://127.0.0.1:40660?timeout=2000
```
