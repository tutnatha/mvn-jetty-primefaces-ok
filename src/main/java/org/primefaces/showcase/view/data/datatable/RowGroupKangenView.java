/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.showcase.view.data.datatable;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
//import org.primefaces.showcase.domain.Car;
//import org.primefaces.showcase.service.CarService;

import org.primefaces.showcase.service.DataProduksiService;
import org.primefaces.showcase.domain.DataProduksi;

@ManagedBean(name="dtRowGroupKangenView")
@ViewScoped
public class RowGroupKangenView implements Serializable {
    
//    private List<Car> cars;
    private List<DataProduksi> dPList;

//    @ManagedProperty("#{carService}")
//    private CarService service;
    @ManagedProperty("#{dataProduksiService}")
    private DataProduksiService service;

    @PostConstruct
    public void init() {
//        cars = service.createCars(50);
    }
    
//    public List<Car> getCars() {
    public List<DataProduksi> getDPList(){
        return dPList;
    }

    public void setService(DataProduksiService service) {
        this.service = service;
    }
    
    public int getRandomPrice() {
		return (int) (Math.random() * 100000);
	}
}
