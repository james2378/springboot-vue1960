const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1n4g0/",
            name: "ssm1n4g0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1n4g0/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "论文投稿系统"
        } 
    }
}
export default base
