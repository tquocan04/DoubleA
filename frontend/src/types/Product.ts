// src/types/Product.ts
export interface ProductType {
    id: number;
    name: string;
    image: string;
    category:string;
    price: string;
  }
 
  export interface Category{
    maLH: string[10];
    tenLH: string;
  }