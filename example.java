    @Autowired
    ShenwanProperty shenwanProperty;

    public void callPythonRegress(){
        try {
            Map<String, String> dataMap = new HashMap();
            dataMap.put("executorHandler", shenwanProperty.getExecutorHandler());
            dataMap.put("executorParams", "");

            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(dataMap);
            HttpUtil.sendSimplePost(shenwanProperty.getUrl(), json);
        } catch (Exception e){
            e.printStackTrace();
        }
    