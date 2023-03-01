package au.edu.swin.sdmd.myapp

class Data {
    companion object {
        var model1 = Model("image1.png", "Chua Mot Cot", "Unknown", 4f, "11/12/2021")
        var model2 = Model("image2.png", "Ho Guom", "Unknown", 2f, "02/12/2022")
        var model3 = Model("image3.png", "Ho Tay", "Unknown", 3f, "11/03/2021")
        var model4 = Model("image4.png", "VM Quoc Tu Giam", "Unknown", 2f, "23/06/2021")

        fun update(model: Model) {
            if(model.image.compareTo(model1.image) == 0){
                model1 = model;
            }
            if(model.image.compareTo(model2.image) == 0){
                model2 = model;
            }
            if(model.image.compareTo(model3.image) == 0){
                model3 = model;
            }
            if(model.image.compareTo(model4.image) == 0){
                model4 = model;
            }
        }
    }


}