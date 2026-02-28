🚀 Desafio POO - Bootcamp Java

Este projeto foi desenvolvido a partir do desafio proposto no curso:

“Desmistifique a Programação Orientada a Objetos (POO) com Java”

A proposta do desafio é aplicar na prática os quatro pilares da Programação Orientada a Objetos:

✅ Abstração

✅ Encapsulamento

✅ Herança

✅ Polimorfismo

Além da implementação base do curso, este projeto foi expandido com novas funcionalidades e melhorias estruturais.

📚 Sobre o Projeto

O sistema simula uma plataforma de Bootcamp, onde:

Desenvolvedores (Dev) podem se inscrever

Bootcamps possuem conteúdos (Curso e Mentoria)

Cada conteúdo gera XP

O Dev evolui conforme progride

É possível calcular XP total e nível do desenvolvedor

🏗 Estrutura do Domínio
📌 Classes Principais

🔹 Conteudo (classe abstrata)

Representa qualquer conteúdo educacional.

Responsável por:

Definir título e descrição

Definir cálculo de XP (método abstrato)

🔹 Curso

Herda de Conteudo.

Possui:

Carga horária

Cálculo de XP baseado na carga horária

🔹 Mentoria

Herda de Conteudo.

Possui:

Data da mentoria

XP fixo diferenciado

🔹 BootCamp

Responsável por:

Nome e descrição

Período de duração

Lista de conteúdos

Lista de desenvolvedores inscritos

🔹 Dev

Representa o desenvolvedor.

Possui:

Conteúdos inscritos

Conteúdos concluídos

Cálculo de XP total

Controle de progresso

Sistema de nível

Status do desenvolvedor

🧠 Conceitos de POO Aplicados
🔷 Abstração

A classe Conteudo define um modelo genérico que é especializado por Curso e Mentoria.

🔷 Encapsulamento

Atributos privados com acesso controlado por métodos.

🔷 Herança

Curso e Mentoria herdam de Conteudo.

🔷 Polimorfismo

O método calcularXP() é sobrescrito em cada tipo de conteúdo.

🆕 Melhorias Implementadas Além do Curso

Este projeto foi expandido com:

✅ Sistema de nível do desenvolvedor (enum Nivel)

✅ Status do desenvolvedor (enum StatusDev)

✅ Melhor organização das responsabilidades nas classes

✅ Uso de Optional para evitar retornos nulos

✅ Uso de Enum para fortalecer a modelagem do domínio.
