    package application;
    import entities.Atendimento;
    import entities.Cliente;
    import java.time.format.DateTimeFormatter;
    import java.time.LocalDate;
    import java.util.Locale;
    import java.util.Scanner;
    import entities.CompraMaterial;
    import repository.ArquivoAtendimento;
    import repository.ArquivoCompraMaterial;
    public class Main {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Registro de Atendimento");

            System.out.print("Cliente: ");
            String nome = sc.nextLine();
            Cliente cliente = new Cliente(nome);

            System.out.print("Data do Atendimento: ");
            String dataStr = sc.nextLine();
            LocalDate data = LocalDate.parse(dataStr, formatter);

            System.out.print("Valor Recebido: R$ ");
            double valorRecebido = sc.nextDouble();

            System.out.print("Gasto com material: R$ ");
            double gastoMaterial = sc.nextDouble();

            System.out.print("Gasto com deslocamento: R$ ");
            double gastoDeslocamento = sc.nextDouble();
            sc.nextLine();

            Atendimento atendimento = new Atendimento(data, cliente, valorRecebido, gastoMaterial, gastoDeslocamento);

            System.out.println("\nAtendimento registrado com sucesso!");
            System.out.println(atendimento);

            System.out.println("Registro de Compra de Material");

            System.out.print("Data da compra (dd/MM/yyyy): ");
            String dataCompraStr = sc.nextLine();
            LocalDate dataCompra = LocalDate.parse(dataCompraStr, formatter);

            System.out.print("Valor da compra: R$ ");
            double valorCompra = sc.nextDouble();
            sc.nextLine(); // limpar quebra de linha

            CompraMaterial compra = new CompraMaterial(dataCompra, valorCompra);
            ArquivoCompraMaterial.salvar(compra);
            ArquivoAtendimento.salvar(atendimento);
            System.out.println("Dados salvos com sucesso nos arquivos!");


            sc.close();




        }
    }
