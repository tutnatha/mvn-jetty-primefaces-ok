/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.primefaces.showcase.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;

//import org.springframework.http.HttpHeaders;
import org.primefaces.showcase.domain.DataProduksi;
import java.io.Serializable;

//import org.apache.tomcat.util.codec.binary.Base64;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;

/**
 *
 * @author tutnatha
 */
public class VoidMain {

    public VoidMain(){
    
    }

//    private HttpHeaders getHeaders() {
//    	String credential="mukesh:m123";
//    	//String credential="tarun:t123";
//    	String encodedCredential = new String(Base64.encodeBase64(credential.getBytes()));
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//     	headers.add("Authorization", "Basic " + encodedCredential);
//    	return headers;
//    }

//    public DataModel<DataProduksi> getAllDataProduksi(){
//	HttpHeaders headers = getHeaders();
//	RestTemplate restTemplate = new RestTemplate();
//	String url = "http://localhost:9090/user/dataProduksi";    //hardcode dulu!!
//
////        String url = SERVICE_BASE_URI+"user/daftarhunianHdrs";
//
//	HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
//	ResponseEntity<DataProduksi[]> responseEntity = restTemplate.exchange(url, 
//            HttpMethod.GET, requestEntity, DataProduksi[].class);
//        DataProduksi[] hdrList = responseEntity.getBody();
//	DataModel<DataProduksi> hdrs = new ArrayDataModel<DataProduksi>(hdrList);
//	return hdrs;
//    }

    public static void main(String[] args){
        VoidMain x = new VoidMain();
//        x.getAllDataProduksi();
    }
}
