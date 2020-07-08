## @ConditionalOnMissingBean
- 이미 내 프로젝트에 등록된 bean이 존재한다면 AutoConfiguration의 빈이 등록되지 않도록 함
- AutoConfiguration에 사용될 빈에다가 @ConditionalOnMissingBean를 달아줘야함

## @ConfigurationProperties, @EnableConfigurationProperties
- 빈을 재정의해서 사용할 수 있다
- application.properties, application.yml에 정의된 내용을 사용 
- AutoConfiguration에 사용될 빈에다가 사용해야함