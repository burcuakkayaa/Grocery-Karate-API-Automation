function fn() {
    var env = karate.env; // get system property 'karate.env'
    karate.log('karate.env system property was:', env);
    if (!env) {
        env = 'dev';
    }
    var config = {
        env: env,
        baseUrl: 'https://ad4b627a-bbd1-4ea3-a678-af41ceb5bfb1.mock.pstmn.io'
    }
    return config;
}