<h1 style: align="center" xmlns:style="http://www.w3.org/1999/xhtml">Rick & Morty's App</h1>

<h2>Esse aplicativo foi criado com o objetivo de estudar a implementação de API's no ambiente de desenvolvimento Android</h2>

![alt text](https://deliriumnerd.com/wp-content/uploads/2019/01/Rick-e-Morty-DELIRIUM-NERD_.jpg)

### Para esse projeto foram utilizados:
<ol>
    <li>Arquitetura MVVM</li>
    <li>Singleton</li>
    <li>Retrofit</li>
</ol>

<a href="https://1drv.ms/b/s!AkxeXy4SOh3phowCyWpNh1Z_63wB7g?e=dwjLOJ">Material de aula utilizado</a>

<a href="https://rickandmortyapi.com/api">URL base da API</a>

<h3 style: align="center">App development step-by-step</h3>

<ol>
    <li>Estudo da API: Requisição e Retornos</li>
    <li>Estruturação da activity:
        <ul>
            <li>main activity</li>
            <li>layout da activity</li>
            <li>recyclerview (Adapter, ViewHolder e LayoutManager)</li>
        </ul>
    </li>
    <li>Criação das data classes (Model)</li>
    <li>Criação do Singleton com o intuito de testar o layout criado, utilizando os construtores de objetos presentes no Model</li>
    <li>Adição das bibliotecas necessárias no Gradle ("Module"):
        <ul>
            <li>implementation 'com.squareup.retrofit2:retrofit:2.9.0'</li>
            <ul>
                <li></li>
            </ul>
    		<li>implementation 'com.squareup.retrofit2:converter-gson:2.9.0'</li>
            <ul>
                <li></li>
            </ul>
    		<li>implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7'</li>
    		<ul>
                <li></li>
            </ul>
            <li>implementation "android.arch.lifecycle:extensions:1.1.1"</li>
    		<ul>
                <li></li>
            </ul>
            <li>implementation 'com.squareup.okhttp3:okhttp:4.2.2'</li>
    		<ul>
                <li></li>
            </ul>
            <li>implementation 'com.squareup.okhttp3:logging-interceptor:4.2.2'</li>
        </ul>
    </li>
    <li>Adição da biblioteca do Picasso também no Gradle
    	<ul>
        	<li>implementation 'com.squareup.picasso:picasso:2.71828'
            <ul><li></li></ul>
            </li>
        </ul>
    </li>
    <li>Criação do pacote "network" que conterá todos os arquivos, classes, etc para a requisição dos dados por meio da API</li>
    <li>Criação da classe "RetrofitInit" e da interface "EndPoint", ambos no pacote "network"			<ul>
        	<li>RetrofitInit - </li>
        	<li>EndPoint - Guarda os endpoints da API</li>
        </ul>
    </li>
    <li>Criação do pacote "repository"
    	<ul>
        	<li>Tem a função de guardar a conexão com todos os endpoints</li>
        </ul>
    </li>
    <li>Criação da classe "repository" que possui o método que de fará a requisição de todos os endpoints da API</li>
</ol>



​    
​    













