package com.jpa.Main;

import dao.ProdutoDao;
import model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoDao dao = new ProdutoDao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Atualizar Produto");
        System.out.println("4 - Deletar Produto");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                Produto produto = new Produto();
                System.out.print("Nome do produto: ");
                produto.setNome(scanner.next());
                System.out.print("Preço do produto: ");
                produto.setPreco(scanner.nextDouble());
                dao.salvar(produto);
                System.out.println("Produto salvo com sucesso!");
                break;

            case 2:
                dao.listar().forEach(p ->
                    System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome() + ", Preço: " + p.getPreco())
                );
                break;

            case 3:
                Produto produtoAtualizado = new Produto();
                System.out.print("ID do produto a atualizar: ");
                produtoAtualizado.setId(scanner.nextInt());
                System.out.print("Novo nome do produto: ");
                produtoAtualizado.setNome(scanner.next());
                System.out.print("Novo preço do produto: ");
                produtoAtualizado.setPreco(scanner.nextDouble());
                dao.atualizar(produtoAtualizado);
                System.out.println("Produto atualizado com sucesso!");
                break;

            case 4:
                System.out.print("ID do produto a deletar: ");
                int id = scanner.nextInt();
                dao.deletar(id);
                System.out.println("Produto deletado com sucesso!");
                break;

            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
